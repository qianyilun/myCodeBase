// Load entire String from File
// https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file

private static String loadEmailContent(String path)
        throws IOException  {
    byte[] encoded = Files.readAllBytes(Paths.get(path));
    return new String(encoded, Charset.defaultCharset());
}