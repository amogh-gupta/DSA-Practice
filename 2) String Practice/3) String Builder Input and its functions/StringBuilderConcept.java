public class StringBuilderConcept {
    public static void main(String[] args) {
        String str = "Amogh";
        // Creating New String Builder Object
        StringBuilder sb = new StringBuilder(str);
        // OR
        // StringBuilder sb = new Stringbuilder("Amogh");
        System.out.println(sb + " Length is: " + sb.length());

        // Appending into stringbuilder object
        sb.append(" Gupta");
        System.out.println(sb + " Length is: " + sb.length());

        // Converting a StringBuilder into String
        System.out.println(sb.toString());

        // Checking character at given index or position
        System.out.println(sb.charAt(6));

        // Deleting a particular character present at given position(index)
        sb.deleteCharAt(6);
        System.out.println(sb);

        // Inserting a particular character at a given index
        sb.insert(6, "g");
        System.out.println(sb);

        // Replacing a character present at a particulat index with provided character
        sb.setCharAt(6, 'G');
        System.out.println(sb);

        // Reversing a string
        sb.reverse();
        System.out.println(sb);

        // Making a new substring
        System.out.println(sb.substring(6));
    }
}
