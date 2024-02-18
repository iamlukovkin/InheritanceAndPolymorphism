package com.task2.behavioral;

public enum AppFunctions {
    CREATE_TRACK {
        @Override
        public String toString() {
            return "Create track";
        }
    },
    CREATE_ALBUM {
        @Override
        public String toString() {
            return "Create album";
        }
    }
}
