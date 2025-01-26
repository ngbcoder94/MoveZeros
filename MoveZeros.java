/*
 * This class will be used to solve the Leetcode problem MoveZeros. 
 *
 * Author: Nick Burkett
 * Date: 01/25/25
 *
 * Status: SOLVED
 */
class MoveZeros{

        /*
         * Here is my zeros method that will be used to solve the problem at hand.
         *
         * @params int[] nums - Array passed in to he modified.
         * @return void - Don't return anything.
         */
        public void zeros(int[] nums){

                int insertPos = 0;  //Need to keep track of where to place the next non-zero element.

                //Now I need to move the non-zero elements. 
                for(int i = 0; i < nums.length; i++){
                        
                        //Check if I have a valid element. 
                        if(nums[i] != 0){
                                nums[insertPos] = nums[i];  //Update the array accordingly if not a 0.
                                insertPos ++;              //Increment the insertPos variable.
                        }
                }

                //Now, I need to backfill the remaining positions with zeros.
                while(insertPos < nums.length){
                        nums[insertPos] = 0;     //Add the zeros to the end.
                        insertPos ++;            //Increment insertPos.
                }


        }

        //Here is my public method for testing/running MoveZeros.
        public static void main(String[] args){
                
                MoveZeros tmpObj = new MoveZeros();     //Create instance of the class for testing.

                int[] tmpArr = {0, 1, 0, 3, 12};        //Create some test data.

                tmpObj.zeros(tmpArr);       //Call my method on the test array.

                //Now I need to loop through to check my updated array.
                for(int i: tmpArr){
                        System.out.println(i);
                }


        }
}
