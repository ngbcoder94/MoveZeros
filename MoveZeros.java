/*
 * This class will be used to solve the Leetcode problem MoveZeros. 
 *
 * Author: Nick Burkett
 * Date: 01/25/25
 *
 * Status: WIP
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
                                insertPost ++;              //Increment the insertPos variable.
                        }
                }


        }

        //Here is my public method for testing/running MoveZeros.
        public static void main(String[] args){

                System.out.println("Hello World");
        }
}
