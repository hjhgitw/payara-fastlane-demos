package my.compary.cdi.demo.music;

import javax.enterprise.inject.Default;

@MusicalInstrument(InstrumentType.KEYBOARD)
@Default
public class Piano implements Instrument {
    @Override
    public String sound() {
        return "piano";
    }
}
