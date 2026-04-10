public class SortArgs {
    public static void sort(String[] args) {
        if (args.length == 0) {
            System.out.println();
            return;
        }

        int[] tab = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            tab[i] = Integer.parseInt(args[i]);
        }

        java.util.Arrays.sort(tab);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tab.length; i++) {
            sb.append(tab[i]);
            if (i < tab.length - 1) {
                sb.append(" ");
            }
        }

        System.out.print(sb.toString() + "\n");
    }
}