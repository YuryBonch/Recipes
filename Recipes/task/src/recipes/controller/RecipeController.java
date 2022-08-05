package recipes.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import recipes.dto.RecipeDto;
import recipes.dto.UserDto;
import recipes.service.RecipeService;
import recipes.service.UserDetailsImpl;
import recipes.service.UserService;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.Map;


@RestController
@RequiredArgsConstructor
@Slf4j
public class RecipeController {

    private final RecipeService recipeService;
    private final UserService userService;
    private final PasswordEncoder encoder;

    @PostMapping("/api/recipe/new")
    public ResponseEntity<Map<String, Long>> setRecipe(@AuthenticationPrincipal UserDetailsImpl user, @Valid @RequestBody RecipeDto recipe) {
        recipe.setUser_id(user.getUser_id());
        long key = recipeService.save(recipe);
        return ResponseEntity.ok(Map.of("id", key));
    }

    @GetMapping("/api/recipe/{id}")
    public ResponseEntity<RecipeDto> getById(@PathVariable("id") @Min(1) int id) {
        RecipeDto recipe = recipeService.get(id);
        return (recipe == null) ? new ResponseEntity<>(HttpStatus.NOT_FOUND) : ResponseEntity.ok(recipe);
    }

    @DeleteMapping("/api/recipe/{recipe_id}")
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void delete(@AuthenticationPrincipal UserDetailsImpl user, @PathVariable long recipe_id) {

        if (recipeService.userOwnsThisRecipe(user.getUser_id(), recipe_id)) {
            boolean ret = recipeService.delete(recipe_id);
            if (ret) {
                throw new ResponseStatusException(HttpStatus.NO_CONTENT);
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }
        }
    }


    @PutMapping("/api/recipe/{recipe_id}")
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void updateRecipe( @AuthenticationPrincipal UserDetailsImpl user, @PathVariable long recipe_id, @Valid @RequestBody RecipeDto recipe ) {

        recipe.setUser_id(user.getUser_id());
        if (recipeService.userOwnsThisRecipe(user.getUser_id(), recipe_id)) {
            boolean ret = recipeService.update(recipe_id, recipe);
            if (ret) {
                throw new ResponseStatusException(HttpStatus.NO_CONTENT);
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }
        }

    }

    @GetMapping(value = "/api/recipe/search", params = {"category"})
    public ResponseEntity<List<RecipeDto>> getByCategory(String category) {
        //log.info("GET /api/recipe/search 1");
        List<RecipeDto> list = recipeService.getByCategory(category);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/api/recipe/search", params = {"name"})
    public ResponseEntity<List<RecipeDto>> getByCName(String name) {
        List<RecipeDto> list = recipeService.getByName(name);
        return ResponseEntity.ok(list);
    }


    @PostMapping("/api/register")
    public ResponseEntity<String> setUser(@Valid @RequestBody UserDto user) {
        user.setPassword(encoder.encode(user.getPassword()));
        // log.info((user.getEmail() + " " + user.getPassword()));
        if (userService.save(user)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok("Valid");
    }
}
