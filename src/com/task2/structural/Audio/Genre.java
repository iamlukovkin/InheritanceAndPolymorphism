package com.task2.structural.Audio;

public enum Genre {
    POP {
        @Override
        public String toString() {
            return "Pop";
        }
    },

    RAP {
        @Override
        public String toString() {
            return "Rap";
        }
    },

    RNB {
        @Override
        public String toString() {
            return "RnB";
        }
    },

    ROCK {
        @Override
        public String toString() {
            return "Rock";
        }
    },

    CLASSICAL {
        @Override
        public String toString() {
            return "Classical";
        }
    },

    JAZZ {
        @Override
        public String toString() {
            return "Jazz";
        }
    }
}
