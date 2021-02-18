package Entity;

public class CongNhan extends Employee {
      private int rank;

      /**
       * @return the rank
       */
      public int getRank() {
            return rank;
      }

      /**
       * @param rank the rank to set
       */
      public void setRank(int rank) {
            this.rank = rank;
      }

      /**
       * @param fullName
       * @param dateofBirth
       * @param gender
       * @param rank
       */
      public CongNhan(String fullName, String dateofBirth, String gender, int rank) {
            super(fullName, dateofBirth, gender);
            this.rank = rank;
      }

      /**
       * 
       */
      public CongNhan() {
      }

      /**
       * @param fullName
       * @param dateofBirth
       * @param gender
       */
      public CongNhan(String fullName, String dateofBirth, String gender) {
            super(fullName, dateofBirth, gender);
      }
}
