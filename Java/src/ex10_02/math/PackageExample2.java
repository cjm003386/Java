package ex10_02.math;                    // ��Ű�� ����

import ex10_02.geometry.polygon.Rectangle;

class PackageExample2 {
    public static void main(String args[]) {
        Rectangle obj = new Rectangle(2, 3); //������ ����
        System.out.println("���� = " + obj.getWidth());
        System.out.println("���� = " + obj.getHeight());
        System.out.println("���� = " + obj.getArea());
    }
}

