package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.hand.Storable;
import homework.day4.playground.essence.material.Pourable;
import homework.day4.playground.utils.VolumeGenerator;

public class StorableProcessor {
    public void runStorable(Storable storable, Pourable pourable) {
        int volume = VolumeGenerator.generateVolume();
        storable.store(pourable, volume);
    }

    public void runStorable(Storable storable, Pourable pourable, int volume) {
        storable.store(pourable, volume);;
    }
}
//значения аргументов не понимаю
