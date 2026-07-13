class Solution {

    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> list = new ArrayList<>();

        // Base string containing all sequential digits
        String s = "123456789";

        // Length of sequential number (2 digits to 9 digits)
        for (int len = 2; len <= 9; len++) {

            // Starting index for substring
            for (int start = 0; start <= 9 - len; start++) {

                // Extract sequential substring
                String part = s.substring(start, start + len);
                int num = Integer.parseInt(part);

                // Checking  its  range
                if (num >= low && num <= high) {
                    list.add(num);
                }
            }
        }

        return list;
    }
}