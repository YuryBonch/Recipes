//

class Clock {
    final int M = 60;
    final int H = 12;

    int hours = H;
    int minutes = 0;

    void next() {
        // implement me
        minutes++;
        if (minutes >= M) {
            hours = (hours == H) ? 1 : hours + 1;
            minutes = 0;
        }

    }
}
