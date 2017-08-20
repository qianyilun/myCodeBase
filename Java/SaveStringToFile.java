// https://stackoverflow.com/questions/1053467/how-do-i-save-a-string-to-a-text-file-using-java
void saveToFile(String formattedJson) {
    BufferedWriter writer = null;
    try {
        writer = new BufferedWriter( new FileWriter("history.json"));
        writer.write(formattedJson);

    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}