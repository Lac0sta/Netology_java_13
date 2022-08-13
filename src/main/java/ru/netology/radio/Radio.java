package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int currentRadioVolume;
    private int radioStationAmount;

    public Radio() {
        radioStationAmount = 10;
    }

    public Radio(int radioStationAmount) {
        this.radioStationAmount = radioStationAmount;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > radioStationAmount - 1) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void changeRadioStationNext() {

        if (currentRadioStation < radioStationAmount - 1) {
            currentRadioStation = currentRadioStation + 1;
            return;
        } else setCurrentRadioStation(0);
    }

    public void changeRadioStationPrev() {

        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
            return;
        } else setCurrentRadioStation(radioStationAmount - 1);
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume > 100) {
            return;
        }
        if (newCurrentRadioVolume < 0) {
            return;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }

    public void changeRadioVolumePlus() {

        if (currentRadioVolume < 100) {
            currentRadioVolume = currentRadioVolume + 1;
            return;
        } else {
            setCurrentRadioVolume(100);
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
