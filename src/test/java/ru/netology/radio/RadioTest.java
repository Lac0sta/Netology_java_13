package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void maySetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayChangeNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.changeRadioStationNext();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayChangeNextStationIfAmountAboveMax() {
        Radio radio = new Radio(11);

        radio.setCurrentRadioStation(7);
        radio.changeRadioStationNext();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchRadioStationFromUpperToLower() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.changeRadioStationNext();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayChangePrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.changeRadioStationPrev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayChangePrevStationIfAmountBelowMax() {
        Radio radio = new Radio(7);
        radio.setCurrentRadioStation(5);

        radio.changeRadioStationPrev();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchRadioStationFromLowerToUpper() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.changeRadioStationPrev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayNotSetRadioStationOverMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayNotSetRadioStationLowerMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maySetRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(57);

        int expected = 57;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayChangeRadioVolumePlus() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(99);

        radio.changeRadioVolumePlus();

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayNotSwitchRadioVolumeFromUpperToLower() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(100);

        radio.changeRadioVolumePlus();

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayChangeRadioVolumeMinus() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(1);

        radio.changeRadioVolumeMinus();

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayNotSwitchRadioVolumeFromLowerToUpper() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(0);

        radio.changeRadioVolumeMinus();

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayNotSetRadioVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(101);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayNotSetRadioVolumeLowerMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }
}