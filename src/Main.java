import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //1 Uzduotis
        Sudek sudetis = new Sudek();
        System.out.println(sudetis.operate(1,1));
        Atimk atimtis = new Atimk();
        System.out.println(atimtis.operate(5,3));
        Padalink dalink = new Padalink();
        System.out.println(dalink.operate(10,5));
        Padaugink daugink = new Padaugink();

        //2 Uzduotis
        Random random = new Random();
        List<Integer> listas = new ArrayList<>();
        List<Double> sumPairs = new ArrayList<>();
        List<Double> subtractPairs = new ArrayList<>();
        List<Double> multiplyPairs = new ArrayList<>();
        List<Double> dividePairs = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            int skaicius = random.nextInt(1, 100);
            listas.add(skaicius);
        }
        for (int i = 0; i < listas.size(); i+=2){
            double sk1 = sudetis.operate(listas.get(i), listas.get(i + 1));
            double sk2 = atimtis.operate(listas.get(i), listas.get(i + 1));
            double sk3 = daugink.operate(listas.get(i), listas.get(i + 1));
            double sk4 = dalink.operate(listas.get(i), listas.get(i + 1));
            sumPairs.add(sk1);
            subtractPairs.add(sk2);
            multiplyPairs.add(sk3);
            dividePairs.add(sk4);
        }
        for (Double d : sumPairs){
            System.out.println(d);
        }
        for (Double d : subtractPairs){
            System.out.println(d);
        }
        for (Double d : multiplyPairs){
            System.out.println(d);
        }
        for (Double d : dividePairs){
            System.out.println(d);
        }
        //3 Uzduotis
        StringOperations uppercaseWords = new StringOperations() {
            @Override
            public String stringManipulate(String input) {
                return input.toUpperCase();
            }
        };
        StringOperations lowercaseWords = new StringOperations() {
            @Override
            public String stringManipulate(String input) {
                return input.toLowerCase();
            }
        };
        StringOperations reversedWords = new StringOperations() {
            @Override
            public String stringManipulate(String input) {
                StringBuilder input1 = new StringBuilder();
                input1.append(input);
                return String.valueOf(input1.reverse());
            }
        };
        //4 Uzduotis
        List<String> savaitesDienos = Arrays.asList("Pirmadienis", "Antradienis", "Treciadienis", "Ketvirtadienis", "Penktadienis", "Sestadienis", "Sekmadienis");
        List<String> uppercaseWords1 = new ArrayList<>();
        List<String> lowercaseWords1 = new ArrayList<>();
        List<String> reversedWords1 = new ArrayList<>();

        for (String s : savaitesDienos){
            String s1 = uppercaseWords.stringManipulate(s);
            String s2 = lowercaseWords.stringManipulate(s);
            String s3 = reversedWords.stringManipulate(s);
            uppercaseWords1.add(s1);
            lowercaseWords1.add(s2);
            reversedWords1.add(s3);
        }
        for (int i = 0; i < uppercaseWords1.size(); i++){
            System.out.println(uppercaseWords1.get(i));
            System.out.println(lowercaseWords1.get(i));
            System.out.println(reversedWords1.get(i));
        }
        //5 uzduotis
        Predicate lyginis = new Predicate() {
            @Override
            public boolean test(int number) {
                if (number % 2 == 0){
                    return true;
                }else{
                    return false;
                }
            }
        };
        Predicate teigiamas = new Predicate() {
            @Override
            public boolean test(int number) {
                if (number >= 0){
                    return true;
                }else{
                    return false;
                }
            }
        };
        Predicate pirminis = new Predicate() {
            @Override
            public boolean test(int number) {
                int a = 0;
                if (number > 0){
                    for (int i = 1; i <= number; i++){
                        if(number % i == 0){
                            a = a + 1;
                        }
                    }
                    if (a > 2){
                        return false;
                    }else{
                        return true;
                    }
                }else{
                    for (int i = -1; i >= number; i--){
                        if(number % i == 0){
                            a = a + 1;
                        }
                    }
                    if (a > 2){
                        return false;
                    }else{
                        return true;
                    }
                }

            }
        };
        //6 Uzduotis
        List<Integer> atsitiktiniaiInt = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 20; i++){
            atsitiktiniaiInt.add(rand.nextInt(-100,100));
        }
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        List<Integer> primaryNumbers = new ArrayList<>();
        List<Integer> notPrimaryNumbers = new ArrayList<>();

        for(int i = 0; i < atsitiktiniaiInt.size(); i++){
            if (lyginis.test(atsitiktiniaiInt.get(i))){
                evenNumbers.add(atsitiktiniaiInt.get(i));
            }else{
                oddNumbers.add(atsitiktiniaiInt.get(i));
            }
            if (teigiamas.test(atsitiktiniaiInt.get(i))){
                positiveNumbers.add(atsitiktiniaiInt.get(i));
            }else{
                negativeNumbers.add(atsitiktiniaiInt.get(i));
            }
            if (pirminis.test(atsitiktiniaiInt.get(i))){
                primaryNumbers.add(atsitiktiniaiInt.get(i));
            }else{
                notPrimaryNumbers.add(atsitiktiniaiInt.get(i));
            }
        }


        System.out.println("Lyginiai: " + evenNumbers);
        System.out.println("Nelyginiai: " + oddNumbers);
        System.out.println("Teigiami: " + positiveNumbers);
        System.out.println("Neigiami: " + negativeNumbers);
        System.out.println("Pirminiai: " + primaryNumbers);
        System.out.println("Nepirminiai: " + notPrimaryNumbers);

        //7 Uzduotis
        Converter tempFToC = new Converter() {
            @Override
            public double convert(double input) {
                return (input - 32) * 5/9 ;
            }
        };
        Converter feetToMeter = new Converter() {
            @Override
            public double convert(double input) {
                return input / 3.281;
            }
        };
        //8 Uzduotis

    }
}
