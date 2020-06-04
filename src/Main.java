import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<PhoneBook> phoneBookList;

    static {
        phoneBookList = new ArrayList<>();
        phoneBookList.add(new PhoneBook("Hiệp", 1232132, "hiep", "hiep@gmail.com", "Viet Nam"));
        phoneBookList.add(new PhoneBook("Phú", 43244324, "phu", "phu@gmail.com", "Viet Nam"));
        phoneBookList.add(new PhoneBook("Liên", 123657546, "lien", "lien@gmail.com", "Viet Nam"));
        phoneBookList.add(new PhoneBook("Sơn", 56475345, "son", "son@gmail.com", "Viet Nam"));
        phoneBookList.add(new PhoneBook("Vũ", 56475345, "vu", "vu@gmail.com", "Viet Nam"));
    }

    public static void menuPhoneBook(){
        System.out.println("\n___________MENU CHỨC NĂNG___________");
        System.out.println("1: Xem danh sách.");
        System.out.println("2: Thêm mới.");
        System.out.println("3: Cập nhật.");
        System.out.println("4: Xóa.");
        System.out.println("5: Tìm kiếm.");
        System.out.println("6: Ghi vào file.");
        System.out.println("7: Đọc từ file.");
        System.out.println("8: Thoát.");
        System.out.println("\nCHỌN CHỨC NĂNG ĐỂ TIẾP TỤC: ");
    }
    public static void main(String[] args) {
        PhoneBookAction phoneBookAction = new PhoneBookAction();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

        Scanner scanner = new Scanner(System.in);
        String path = "PhoneBook.data";
        int chooseNumber= 0;
        while (chooseNumber != 8) {
            menuPhoneBook();
            chooseNumber = scanner.nextInt();

            switch (chooseNumber) {
                case 1:
                    System.out.println("Hiển thị danh bạ: \n");
                    phoneBookAction.display(phoneBookList);
                    break;
                case 2:
                    System.out.println("Thêm mới danh bạ:\n");
                    phoneBookAction.addPhoneBook(phoneBookList);
                    break;
                case 3:
                    System.out.println("Cập nhật danh bạ:\n");
                    phoneBookAction.updatePhonebook(phoneBookList);
                    break;
                case 4:
                    System.out.println("xóa liên hệ danh bạ:\n");
                    phoneBookAction.deletePhonebook(phoneBookList);
                    break;
                case 5:
                    System.out.println("Tìm kiếm danh bạ:\n");
                    phoneBookAction.searchPhoneBook(phoneBookList);
                    break;
                case 6:
                    System.out.println("Ghi vào file .DATA\n");
                    readAndWriteFile.writeFileCSV(path, phoneBookList);
                    break;
                case 7:
                    System.out.println("Đọc từ file .DATA\n");
                    List<PhoneBook> list=new ArrayList<>();
                    list = readAndWriteFile.readFileCSV(path);
                    for (PhoneBook phoneBook : list) {
                        System.out.println(phoneBook);
                    }
                    break;
                case 8:
                    break;
            }
        }
    }
}
