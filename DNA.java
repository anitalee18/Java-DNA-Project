public class DNA {
    // this program determines if there are protein sequences in the strand of DNA. A protein has these qualities: begins with a "start codon" ATG, ends with a "stop codon" of TGA, and in between each additional codon is a sequence of three nucleotides. There are thee string dnas to test: dna1, dna2, dna3. Can alternatively create an input method if more testing was required.
  
    public static void main (String[] args){
      
      // -. .-.   .-. .-.   .
      //   \   \ /   \   \ /
      //  / \   \   / \   \
      // ~   `-~ `-`   `-~ `-
  
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";
      String dna = dna2;
      int length = dna.length();
      System.out.println("Length: " + length);
      int start = dna.indexOf("ATG");
      System.out.println("Start: " + start);
      int stop = dna.indexOf("TGA");
      System.out.println("Stop: " + stop);
      if (start != -1 && 
          stop != -1  && 
         (stop-start) % 3 == 0){
  
        String protein = dna.substring(start, stop+3);
        System.out.println("DNA contains a protein : " + protein);
      }else{
        System.out.println("No protein.");
      }
  
    }
  }