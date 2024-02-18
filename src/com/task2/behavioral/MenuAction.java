package com.task2.behavioral;

public enum MenuAction {
    EXIT {
        @Override
        public String toString() {
            return "Выход";
        }
    },

    ADD_TRACK {
        @Override
        public String toString() {
            return "Добавить трек";
        }
    },

    ADD_ALBUM {
        @Override
        public String toString() {
            return "Добавить альбом";
        }
    },

    DISPLAY_TRACKS {
        @Override
        public String toString() {
            return "Показать треки";
        }
    },

    DISPLAY_ALBUMS {
        @Override
        public String toString() {
            return "Показать альбомы";
        }
    },

    ORDER_TRACKS_BY_DURATION {
        @Override
        public String toString() {
            return "Сортировать по продолжительности";
        }
    },

    ORDER_TRACKS_BY_GENRE {
        @Override
        public String toString() {
            return "Сортировать по жанру";
        }
    },

    DISPLAY_TRACKS_BY_GENRE {
        @Override
        public String toString() {
            return "Показать треки по жанру";
        }
    },
    RECORD_TO_DISK {
        @Override
        public String toString() {
            return "Записать плейлист в диск";
        }
    };

    public static void execute(int choice, AbstractMenu menu) {
        MenuAction action = MenuAction.values()[choice];
        switch (action) {
            case EXIT:
                menu.exit();
                break;
            case ADD_TRACK:
                menu.getPlaylist().addNewTrack();
            case ADD_ALBUM:
                menu.getPlaylist().addNewAlbum();
            case DISPLAY_TRACKS:
                menu.displayTracks();
                break;
            case ORDER_TRACKS_BY_DURATION:
                menu.orderTracksByDurationRange();
                break;
            case DISPLAY_ALBUMS:
                menu.displayAlbums();
                break;
            case DISPLAY_TRACKS_BY_GENRE:
                menu.displayTracksByGenre();
                break;
            case ORDER_TRACKS_BY_GENRE:
                menu.orderTracksByGenre();
                break;
            case RECORD_TO_DISK:
                menu.getPlaylist().recordToDisk(menu.getDisk());
            default:
                break;
        }
    }
}
