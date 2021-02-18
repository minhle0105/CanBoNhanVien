package Entity;

public class NhanVien extends Employee {
      private String mainTask;

      /**
       * @return the mainTask
       */
      public String getMainTask() {
            return mainTask;
      }

      /**
       * @param mainTask the mainTask to set
       */
      public void setMainTask(String mainTask) {
            this.mainTask = mainTask;
      }

      /**
       * @param mainTask
       */
      public NhanVien(String mainTask) {
            this.mainTask = mainTask;
      }

      /**
       * @param fullName
       * @param dateofBirth
       * @param gender
       * @param mainTask
       */
      public NhanVien(String fullName, String dateofBirth, String gender, String mainTask) {
            super(fullName, dateofBirth, gender);
            this.mainTask = mainTask;
      }

      /**
       * 
       */
      public NhanVien() {
      }
}
