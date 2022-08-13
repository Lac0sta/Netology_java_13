package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int currentRadioVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void changeRadioStationNext() {

        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
            return;
        } else setCurrentRadioStation(0);
    }

    public void changeRadioStationPrev() {

        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
            return;
        } else setCurrentRadioStation(9);
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume > 10) {
            return;
        }
        if (newCurrentRadioVolume < 0) {
            return;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }

    public void changeRadioVolumePlus() {

        if (currentRadioVolume < 10) {
            currentRadioVolume = currentRadioVolume + 1;
            return;
        } else {
            setCurrentRadioVolume(10);
        }
    }

    public void changeRadioVolumeMinus() {

        if (currentRadioVolume > 0) {
            currentRadioVolume = currentRadioVolume - 1;
            return;
        } else {
            setCurrentRadioVolume(0);
        }
    }
}
