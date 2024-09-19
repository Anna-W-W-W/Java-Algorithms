package string;

public class StringSearchUtility {

    /**
     * This method searches for the first occurrence of a substring (`needle`)
     * within a given string (`haystack`). If the substring is found, it returns
     * the index of its first occurrence. If it's not found, the method returns -1.
     *
     * @param haystack The string in which to search.
     * @param needle The substring to search for.
     * @return The index of the first occurrence of `needle` in `haystack`, or -1 if not found.
     */
    public static int strStr(String haystack, String needle) {
        // If the length of `haystack` is less than that of `needle`, it's impossible to find `needle`.
        if (haystack.length() < needle.length()) return -1;

        // If `haystack` contains `needle`, return the index of its first occurrence.
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }

        // If `needle` is not found in `haystack`, return -1.
        return -1;
    }
}

