class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int val = 0;

        for (int i=0;i<n;i++){
            if (operations[i].equals("--X")  || operations[i].equals("X--")){
                val -= 1;
            }
            else{
                val +=1;
            }
        }
        return val;
    }
}