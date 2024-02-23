public class ProgramVector {
    private static void afisare(int[] vector, String mesaj){
        System.out.printf("%s (%d elemente): ", mesaj, vector.length);
        for (int valoare: vector){
            System.out.print(valoare + " ");
        }
    }

    static void incrementare(int[] vector){
//        for(int valoare: vector){
//            valoare = valoare+1;
//        }
        for(var i = 0; i<vector.length; i++){
            int valoare = vector[i];
            vector[i] = valoare+1;
        }
    }

    static int[] inserare (int valoare, int[] vector){
        return vector;
    }
    private static void inserare(int[] v) {
    }

    public static void main(String[] args) { //daca scrii doar main, iti autocompleteaza functia main
//        System.out.printf("Numar parametri: %d%n", args.length);
//        for (int i=0; i< args.length; i++){
//            System.out.println(args[i]);
//        for (String valoareArgument: args){
//            System.out.println(valoareArgument); // asta nu merge, returneaza eroare java: class, interface, enum, or record expected
//        }

            var valori = args[0].split(",");
            int[]v = new int [valori.length];
            for (var i = 0; i < valori.length; i++){
                v[i]= Integer.parseInt(valori[i]);

            }
            afisare(v, "\n Fara incrementare: ");
            incrementare(v);
            afisare(v, "\n Dupa incrementare: ");
            inserare(v);
            afisare(v, "\n Dupa inserare: ");
        }


}
// tema functie de inserare // sa inseram si acel element, la inceput (inserat se face ca in C) // se declara vector nou de dimensiune initial + 1, pus elementul de inserat si afisat
//