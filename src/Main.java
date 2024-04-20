import java.util.*;

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
        List<Integer> converterList = new ArrayList<>();
        List<Double> celciusList = new ArrayList<>();
        List<Double> metersList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            converterList.add(rand.nextInt(1, 100));
        }
        for (Integer i : converterList){
            celciusList.add(Double.valueOf(String.format("%.1f", tempFToC.convert(i))));
            metersList.add(Double.valueOf(String.format("%.2f", tempFToC.convert(i))));
        }
        System.out.println(celciusList);
        System.out.println(metersList);

        //9 Uzduotis
        List<String> stringList = new ArrayList<>();

        SortText rusiavimas = new SortText() {
            @Override
            public List<String> sort(List<String> list) {
                Collections.sort(list);
                return list;
            }
        };
        stringList.add("Pelyte");
        stringList.add("Ekranas");
        stringList.add("Vaizdo plokste");
        stringList.add("Klaviatura");
        stringList.add("RAM");
        System.out.println(rusiavimas.sort(stringList));

        //10 Uzduotis
        SortInteger integerList = new SortInteger() {
            @Override
            public List<Integer> sort(List<Integer> list) {
                Collections.sort(list);
                return list;
            }
        };
        List<Integer> integerList2 = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            integerList2.add(random.nextInt(1, 100));
        }
        System.out.println(integerList.sort(integerList2));

        Transformer transformer = new Transformer() {
            @Override
            public List<String> transform(List<String> list) {
                for(int i = 0; i < list.size(); i++){
                    if (list.get(i).equals("")){
                        list.remove(list.get(i));
                    }
                }
                return list;
            }
        };
        List<String> emptyStrings = new ArrayList<>();
        emptyStrings.add("Bulves");
        emptyStrings.add("");
        emptyStrings.add("Keciupas");
        emptyStrings.add("");
        emptyStrings.add("Apelsinai");
        emptyStrings.add("");
        emptyStrings.add("Sultys");
        emptyStrings.add("");
        emptyStrings.add("Pupeles");
        emptyStrings.add("");

        System.out.println(transformer.transform(emptyStrings));

        //12 Uzduotis

        List<StringOperations> stringOperacijos = new ArrayList<>();
        stringOperacijos.add(uppercaseWords);
        stringOperacijos.add(lowercaseWords);
        stringOperacijos.add(reversedWords);

        performActions("BaNanIniS", stringOperacijos);

    }
    public static void performActions(String text, List<StringOperations> list){
        for(StringOperations s : list){
            System.out.println(s.stringManipulate(text));
        }
    }

}
