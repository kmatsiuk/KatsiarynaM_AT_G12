package bubbles;

class SparklingWater extends Water {
    private Bubble[] bubbles;

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void degas() {
        if (bubbles == null) return;
        for (Bubble bubble : bubbles) {
            if (bubble != null) {
                bubble.pop();
            }
        }
        bubbles = new Bubble[0];
    }
}
