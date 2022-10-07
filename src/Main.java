public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, -4, 15, 76, 22};
        int key = 16;
        boolean found = false;
        for (int i =0; !found && i < numbers.length; i++)
        {
           if (numbers[i] == key)
               found = true;
        }
        System.out.println (found);
    }

    static void jfds() {
        Reservation[] reservations = new Reservation[3];
        reservations [0] = new Reservation ("John", 15);
        reservations [1] = new Reservation ("Jane", 2);
        reservations [2] = new Reservation ("Wendy", 15);

        String key = "Jane";
        for (Reservation r : reservations)
            if (r.name.equals (key))
            {
                System.out.println (r.room);
                break;
            }
    }
}

class Reservation
{
    Reservation (String name, int room)
    {
        this.name=name;
        this.room=room;
    }
    String name;
    int room;
}