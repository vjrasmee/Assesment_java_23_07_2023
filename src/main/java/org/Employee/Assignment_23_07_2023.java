package org.Employee;




import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Assignment_23_07_2023 {
    public static <Workbook> void main(String[] args) throws FileNotFoundException {
 String excelFilePath="src/main/resources/employee.xlsx";
 tyr{
            FileInputStream fileInputStream=new FileInputStream(excelFilePath);
            Workbook workbook=WorkbookFactory.create(fileInputStream){
                Sheet sheet=workbook.getSheetAT(0);
                for(Row row:sheet){
                    if (row.getRowNum()==0){
                        continue;
                    }
                    itn experiance=(int) row.getCell(4).getNumericCellValue();
                    double salary =calculateSalary(experiance);
                    Cell salaryCell=row.createCellnew CellType.NUMERIC);
                    SalaryCell.setCellValue(salary);




                }
                try (FileOutputStream fos = new FileOutputStream("employee_with_salary.xlsx")) {
                    workbook.write(fos);
                }

                System.out.println("Salary calculation completed and saved to employee_with_salary.xlsx");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static double calculateSalary(int experience) {
            if (experience < 5) {
                return 1000 * 5;
            } else if (experience >= 5 && experience < 10) {
                return 2500 * 5;
            } else if (experience >= 10 && experience < 20) {
                return 5000 * 5;
            } else {
                return 8000 * 5;

            }
        }

    }

    }
