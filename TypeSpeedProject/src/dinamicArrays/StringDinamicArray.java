package dinamicArrays;

public class StringDinamicArray {


        public String[] strings;

        public StringDinamicArray(){
            strings = new String[0];
        }

        public void add(String str){
            String[] newString = new String[strings.length + 1];
            for (int i = 0; i < strings.length; i++){
                newString[i] = strings[i];
            }
            newString[strings.length] = str;
            strings = newString;
        }

        public void delete(int index) throws IllegalArgumentException{
            if (index < 0 || index >= strings.length){
                throw new IllegalArgumentException("Out of Index..");
                }
            String[] newArray = new String[strings.length - 1];

            for (int i = 0, k = 0; i < strings.length; i++){
                if (i == index){
                    continue;
                }
                newArray[k++] = strings[i];
                strings = newArray;

            }
        }

        public String get(int index){
            if (index < 0 || index >= strings.length){
                throw new IllegalArgumentException();
            }
            return strings[index];
        }

        public int getSize(){
            return strings.length;
        }





    }

