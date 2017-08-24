// Read String/(int)... from a file
private static void assignEmailList() {
        File file = new File("email list.txt");
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(emailList);
    }
