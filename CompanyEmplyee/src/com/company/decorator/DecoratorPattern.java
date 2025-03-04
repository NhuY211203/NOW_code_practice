package com.company.decorator;

interface Employee {
    void handleRequest();
}

class BasicEmployee implements Employee {
    private String chucVu;

    public BasicEmployee(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public void handleRequest() {
        System.out.println("Nhân viên với chức vụ: " + chucVu);
    }
}

abstract class EmployeeDecorator implements Employee {
    protected Employee decoratedEmployee;

    public EmployeeDecorator(Employee decoratedEmployee) {
        this.decoratedEmployee = decoratedEmployee;
    }

    @Override
    public void handleRequest() {
        decoratedEmployee.handleRequest();
    }
}

class DoiTruongDecorator extends EmployeeDecorator {
    public DoiTruongDecorator(Employee decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void handleRequest() {
        super.handleRequest();
        System.out.println("Công việc của Đội trưởng:");
        System.out.println("- Đi tuần kiểm tra");
        System.out.println("- Gán việc cho nhân viên");
    }
}

class GiamDocDecorator extends EmployeeDecorator {
    public GiamDocDecorator(Employee decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void handleRequest() {
        super.handleRequest();
        System.out.println("Công việc của Giám đốc:");
        System.out.println("- Quản lý toàn bộ công ty");
        System.out.println("- Ra quyết định chiến lược");
    }
}

class NhanVienVPDecorator extends EmployeeDecorator {
    public NhanVienVPDecorator(Employee decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void handleRequest() {
        super.handleRequest();
        System.out.println("Công việc của Nhân viên Văn phòng:");
        System.out.println("- Pha trà");
        System.out.println("- Phê duyệt tài liệu");
    }
}

class NhanVienXuongDecorator extends EmployeeDecorator {
    public NhanVienXuongDecorator(Employee decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void handleRequest() {
        super.handleRequest();
        System.out.println("Công việc của Nhân viên Xưởng:");
        System.out.println("- Sản xuất sản phẩm");
        System.out.println("- Bảo trì máy móc");
    }
}

class KeToanTruongDecorator extends EmployeeDecorator {
    public KeToanTruongDecorator(Employee decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void handleRequest() {
        super.handleRequest();
        System.out.println("Công việc của Kế toán trưởng:");
        System.out.println("- Quản lý tài chính");
        System.out.println("- Lập báo cáo tài chính");
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        Employee dt = new DoiTruongDecorator(new BasicEmployee("Đội trưởng"));
        dt.handleRequest();

        Employee gd = new GiamDocDecorator(new BasicEmployee("Giám đốc"));
        gd.handleRequest();

        Employee nvvp = new NhanVienVPDecorator(new BasicEmployee("Nhân viên VP"));
        nvvp.handleRequest();

        Employee nvx = new NhanVienXuongDecorator(new BasicEmployee("Nhân viên Xưởng"));
        nvx.handleRequest();

        Employee kt = new KeToanTruongDecorator(new BasicEmployee("Kế toán trưởng"));
        kt.handleRequest();
    }
}