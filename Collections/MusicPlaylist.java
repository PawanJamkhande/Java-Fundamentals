package Collections;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicPlaylist {
    private LinkedList<Song> playlist = new LinkedList<>();
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new MusicPlaylist().menu();
    }

    public void menu() {
        while (true) {
            System.out.println("\n=== Music Playlist Menu ===");
            System.out.println("1) Add song");
            System.out.println("2) Play first song");
            System.out.println("3) Play last song");
            System.out.println("4) Remove song");
            System.out.println("5) Update song");
            System.out.println("6) View playlist");
            System.out.println("7) Shuffle playlist");
            System.out.println("8) Exit");
            System.out.print("Choose option: ");

            int choice = readInt();
            try {
                switch (choice) {
                    case 1 -> addSong();
                    case 2 -> playFirst();
                    case 3 -> playLast();
                    case 4 -> removeSong();
                    case 5 -> updateSong();
                    case 6 -> viewPlaylist();
                    case 7 -> shufflePlaylist();
                    case 8 -> { System.out.println("Exiting."); return; }
                    default -> System.out.println("Invalid choice.");
                }
            } catch (SongNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void addSong() {
        System.out.print("Enter song id (int): ");
        int id = readInt();
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter artist: ");
        String artist = sc.nextLine();
        System.out.print("Enter duration in minutes (e.g. 3.45): ");
        double dur = readDouble();

        Song s = new Song(id, title, artist, dur);
        playlist.add(s);
        System.out.println("Added: " + s);
    }

    private void playFirst() throws SongNotFoundException {
        if (playlist.isEmpty()) throw new SongNotFoundException("Playlist is empty.");
        System.out.println("Playing first: " + playlist.getFirst());
    }

    private void playLast() throws SongNotFoundException {
        if (playlist.isEmpty()) throw new SongNotFoundException("Playlist is empty.");
        System.out.println("Playing last: " + playlist.getLast());
    }

    private void removeSong() throws SongNotFoundException {
        System.out.print("Enter title to remove: ");
        String title = sc.nextLine();
        ListIterator<Song> it = playlist.listIterator();
        while (it.hasNext()) {
            Song s = it.next();
            if (s.getTitle().equalsIgnoreCase(title)) {
                it.remove();
                System.out.println("Removed: " + s);
                return;
            }
        }
        throw new SongNotFoundException("Song '" + title + "' not found.");
    }

    private void updateSong() throws SongNotFoundException {
        System.out.print("Enter title to update: ");
        String title = sc.nextLine();
        for (int i = 0; i < playlist.size(); i++) {
            Song s = playlist.get(i);
            if (s.getTitle().equalsIgnoreCase(title)) {
                System.out.print("New title (leave empty to keep): ");
                String nt = sc.nextLine();
                if (!nt.isBlank()) s.setTitle(nt);
                System.out.print("New artist (leave empty to keep): ");
                String na = sc.nextLine();
                if (!na.isBlank()) s.setArtist(na);
                System.out.print("New duration (0 to keep): ");
                double nd = readDouble();
                if (nd > 0) s.setDuration(nd);
                System.out.println("Updated: " + s);
                return;
            }
        }
        throw new SongNotFoundException("Song '" + title + "' not found.");
    }

    private void viewPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        System.out.println("\n--- Playlist ---");
        int i = 1;
        for (Song s : playlist) {
            System.out.println(i++ + ". " + s);
        }
    }

    private void shufflePlaylist() {
        Collections.shuffle(playlist);
        System.out.println("Playlist shuffled.");
    }

    // helper input methods
    private int readInt() {
        while (true) {
            try {
                String line = sc.nextLine();
                return Integer.parseInt(line.trim());
            } catch (Exception e) {
                System.out.print("Invalid int, try again: ");
            }
        }
    }

    private double readDouble() {
        while (true) {
            try {
                String line = sc.nextLine();
                if (line.isBlank()) return 0;
                return Double.parseDouble(line.trim());
            } catch (Exception e) {
                System.out.print("Invalid number, try again: ");
            }
        }
    }
}
