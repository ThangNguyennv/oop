package exam.midterm.test3.vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BasicStatistics {
    private MyVector[] vectors;

    public BasicStatistics(MyVector[] vectors) {
        this.vectors = vectors;
    }

    public static void main(String[] args) {
        /*
         TODO

         Thực hiện các yêu cầu sau.

         I. Test chức năng vector
           - Viết các hàm testArrayVector để test các chứ năng của array vector, như thêm vào tọa độ, xóa bớt số trục tọa độ,
             sửa giá trị tọa độ, cộng các vector, nhân vector với giá trị vô hướng, nhân vô hướng 2 vector, ...
           - Viết các hàm testListVector để test các chứ năng của list vector, như thêm vào tọa độ, xóa bớt số trục tọa độ,
             sửa giá trị tọa độ, cộng các vector, nhân vector với giá trị vô hướng, nhân vô hướng 2 vector, ...

         II. Thực hiện thống kê đơn giản với các vector
           - Tạo ra ít nhất 10 vector và cho vào mảng vectors để quản lý. Trong đó có ít nhất 2 nhóm các vector
             có chuẩn bằng nhau.
           - Tìm và in ra thông tin chuẩn nhó nhất, chuẩn lớn nhất của các vector.
           - In ra các vector có chuẩn sắp xếp theo thứ tự tăng dần, giản dần.
           - In ra các vector có chuẩn nằm trong một đoạn [a, b] cho trước.
           - In ra rank của các vector theo thứ tự trong mảng vectors.

         III. Lưu các kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_Vector>.txt
              (ví dụ NguyenVanA_123456_Vector.txt) và nộp cùng source code.
         */

        testArrayVector();
        System.out.println();

        testListVector();
        System.out.println();

        doSimpleStatic();
    }

    public static void testArrayVector() {
        /* TODO */
        MyArrayVector myArrayVector1 = new MyArrayVector();
        MyArrayVector myArrayVector2 = new MyArrayVector();
        myArrayVector1.insert(1);
        myArrayVector1.insert(2);
        myArrayVector1.insert(3);
        myArrayVector1.insert(4);
        myArrayVector1.insert(5);
        System.out.println("myArrayVector1 hiện tại là: " + myArrayVector1.toString());

        myArrayVector2.insert(1);
        myArrayVector2.insert(2);
        myArrayVector2.insert(3);
        myArrayVector2.insert(4);
        myArrayVector2.insert(5);
        System.out.println("myArrayVector2 hiện tại là: " + myArrayVector2.toString());

        myArrayVector1.remove(1);
        System.out.println("myArrayVector1 sau khi bị xóa là: " + myArrayVector1.toString());

        myArrayVector2.remove(2);
        System.out.println("myArrayVector2 sau khi bị xóa là: " + myArrayVector2.toString());

        myArrayVector1.set(555, 2);
        System.out.println("myArrayVector1 sau khi thay đổi là: " + myArrayVector1.toString());

        myArrayVector2.set(444, 1);
        System.out.println("myArrayVector2 sau khi thay đổi là: " + myArrayVector2.toString());

        System.out.println("Phép cộng 2 vector là: " + myArrayVector1.add(myArrayVector2));
        System.out.println("Phép trừ 2 vector là: " + myArrayVector1.minus(myArrayVector2));


        System.out.println("Phép nhân vector myArrayVector1 với 1 giá trị là: " + myArrayVector1.scale(2));

        System.out.println("Phép nhân vô hướng 2 vector myArrayVector1 và myArrayVector2 là: " +
                myArrayVector1.dot(myArrayVector2));

        int[] indices = new int[]{3, 2, 1};
        System.out.println("Vector con ban đầu của myArrayVector1 được trích xuất theo chỉ số của mảng đầu vào là: " +
                myArrayVector1.extract(indices));

    }

    public static void testListVector() {
        /* TODO */
        MyListVector myListVector1 = new MyListVector();
        MyListVector myListVector2 = new MyListVector();
        myListVector1.insert(1);
        myListVector1.insert(2);
        myListVector1.insert(3);
        myListVector1.insert(4);
        myListVector1.insert(5);
        System.out.println("myListVector1 hiện tại là: " + myListVector1.toString());

        myListVector2.insert(1);
        myListVector2.insert(2);
        myListVector2.insert(3);
        myListVector2.insert(4);
        myListVector2.insert(5);
        System.out.println("myListVector2 hiện tại là: " + myListVector2.toString());

        myListVector1.remove(1);
        System.out.println("myListVector1 sau khi bị xóa là: " + myListVector1.toString());

        myListVector2.remove(2);
        System.out.println("myListVector2 sau khi bị xóa là: " + myListVector2.toString());

        myListVector1.set(555, 2);
        System.out.println("myListVector1 sau khi thay đổi là: " + myListVector1.toString());

        myListVector2.set(444, 1);
        System.out.println("myListVector2 sau khi thay đổi là: " + myListVector2.toString());

        System.out.println("Phép cộng 2 vector là: " + myListVector1.add(myListVector2));
        System.out.println("Phép trừ 2 vector là: " + myListVector1.minus(myListVector2));


        System.out.println("Phép nhân vector myListVector1 với 1 giá trị là: " + myListVector1.scale(2));

        System.out.println("Phép nhân vô hướng 2 vector myListVector1 và myListVector2 là: " +
                myListVector1.dot(myListVector2));

        int[] indices = new int[]{3, 2, 1};
        System.out.println("Vector con ban đầu của myListVector1 được trích xuất theo chỉ số của mảng đầu vào là: " +
                myListVector1.extract(indices));

    }

    public static void doSimpleStatic() {
        /* TODO */
        MyVector[] vectors = new MyVector[10];
        vectors[0] = new MyArrayVector(new double[]{1, 2});       // norm ≈ 2.236
        vectors[1] = new MyArrayVector(new double[]{2, 1});       // norm ≈ 2.236 (nhóm 1)
        vectors[2] = new MyArrayVector(new double[]{3, 4});       // norm = 5.0
        vectors[3] = new MyArrayVector(new double[]{4, 3});       // norm = 5.0   (nhóm 2)
        vectors[4] = new MyArrayVector(new double[]{0, 0, 1});    // norm = 1.0
        vectors[5] = new MyArrayVector(new double[]{1, 0, 0});    // norm = 1.0   (nhóm 3)
        vectors[6] = new MyArrayVector(new double[]{2, 2, 2});    // norm = √12 ≈ 3.464
        vectors[7] = new MyArrayVector(new double[]{3, 3, 3});    // norm = √27 ≈ 5.196
        vectors[8] = new MyArrayVector(new double[]{1, 1, 1, 1}); // norm = 2.0
        vectors[9] = new MyArrayVector(new double[]{2, 2, 0, 0}); // norm = √8 ≈ 2.828

        System.out.println("----- Danh sách vector ban đầu -----");
        for (MyVector v : vectors) {
            System.out.println(v + " | norm: " + v.norm());
        }
        System.out.println();

        // Tạo đối tượng quản lý vector
        BasicStatistics vectorManager = new BasicStatistics(vectors);

        // In ra norm lớn nhất và norm nhỏ nhất
        System.out.println("Norm lớn nhất: " + vectorManager.normMax());
        System.out.println("Norm nhỏ nhất: " + vectorManager.normMin());
        System.out.println();


        // Sắp xếp theo norm tăng dần
        MyVector[] sortedAsc = vectorManager.sortNorm(true);
        System.out.println("----- Các vector sắp xếp theo norm tăng dần -----");
        for (MyVector v : sortedAsc) {
            System.out.println(v + " | norm: " + v.norm());
        }
        System.out.println();

        // Sắp xếp theo norm giảm dần
        MyVector[] sortedDesc = vectorManager.sortNorm(false);
        System.out.println("----- Các vector sắp xếp theo norm giảm dần -----");
        for (MyVector v : sortedDesc) {
            System.out.println(v + " | norm: " + v.norm());
        }
        System.out.println();

        // Lọc các vector có norm nằm trong đoạn [a, b]
        int a = 2, b = 4;  // ví dụ từ 2 đến 4
        MyVector[] filtered = vectorManager.filter(a, b);
        System.out.println("----- Các vector có norm nằm trong đoạn [" + a + ", " + b + "] -----");
        for (MyVector v : filtered) {
            System.out.println(v + " | norm: " + v.norm());
        }
        System.out.println();

        // Tính và in ra rank của các vector (theo thứ tự ban đầu)
        double[] ranks = vectorManager.rank();
        System.out.println("----- Rank của các vector theo thứ tự ban đầu -----");
        for (int i = 0; i < ranks.length; i++) {
            System.out.println("Vector " + (i + 1) + " (" +
                    vectors[i] + ") | norm: " + vectors[i].norm() + " | rank: " + ranks[i]);
        }
    }

    /**
     * Lấy giá trị chuẩn lớn nhất trong các vector.
     *
     * @return chuẩn lớn nhất.
     */
    public double normMax() {
        /* TODO */
        double maxNorm = Double.MIN_VALUE;
        for (MyVector vector : vectors) {
            maxNorm = Math.max(maxNorm, vector.norm());
        }
        return maxNorm;
    }

    /**
     * Lấy giá trị chuẩn nhỏ nhất trong các vector.
     *
     * @return chuẩn nhỏ nhất.
     */
    public double normMin() {
        /* TODO */
        double minNorm = Double.MIN_VALUE;
        for (MyVector vector : vectors) {
            minNorm = Math.min(minNorm, vector.norm());
        }
        return minNorm;
    }

    /**
     * Lấy ra mảng các vector được sắp xếp theo thứ tự của chuẩn.
     * Nếu order là true thì mảng đầu ra là các vector có chuẩn tăng dần.
     * Nếu order là false thì mảng đầu ra là các vector có chuẩn giảm dần.
     *
     * @return mảng các vector theo thứ tự mảng tăng dần.
     */
    public MyVector[] sortNorm(boolean order) {
        /* TODO */
        MyVector[] sorted = Arrays.copyOf(vectors, vectors.length);
        if (order) {
            Arrays.sort(sorted, Comparator.comparingDouble(MyVector::norm));
        } else {
            Arrays.sort(sorted, (v1, v2) -> Double.compare(v2.norm(), v1.norm()));
        }
        return sorted;
    }

    /**
     * Lọc ra mảng các vector có chuẩn năm trong đoạn [from, to].
     *
     * @param from
     * @param to
     * @return các vector có chuẩn nằm trong đoạn [from, to]
     */
    public MyVector[] filter(int from, int to) {
        /* TODO */
        List<MyVector> list = new ArrayList<>();
        for (MyVector v : vectors) {
            double n = v.norm();
            if (n >= from && n <= to) {
                list.add(v);
            }
        }
        return list.toArray(new MyVector[list.size()]);
    }

    /**
     * Lấy ra thông tin rank của các vector trong mảng theo chuẩn.
     * Rank được tính theo quy luật sau, ví dụ
     * - tập [3 1 4] có rank [2.0 1.0 3.0]
     * - tập [3 1 3 5] có các rank [2.5 1.0 4.0] (các phần tử có giá trị bằng nhau có rank
     * được tính bằng trung bình các chỉ số của các phần tử trong tập dữ liệu, chỉ sổ bắt
     * đầu là 1)
     *
     * @return
     */
    public double[] rank() {
        /* TODO */
        int n = vectors.length;
        double[] norms = new double[n];
        for (int i = 0; i < n; i++) {
            norms[i] = vectors[i].norm();
        }
        double[] ranks = new double[n];

        // Tạo mảng các cặp (index, norm)
        class Pair {
            int index;
            double value;
            Pair(int index, double value) {
                this.index = index;
                this.value = value;
            }
        }
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(i, norms[i]);
        }

        // Sắp xếp theo giá trị norm tăng dần
        Arrays.sort(pairs, (p1, p2) -> Double.compare(p1.value, p2.value));

        int i = 0;
        while (i < n) {
            int j = i;
            // Tìm tất cả các phần tử có norm bằng nhau (tie)
            while (j < n && Double.compare(pairs[j].value, pairs[i].value) == 0) {
                j++;
            }
            // Tính rank trung bình cho nhóm này:
            // ví dụ, nếu các phần tử ở vị trí 2 và 3 (bắt đầu từ 1) thì rank = (3 + 4)/2 = 3.5
            double avgRank = ((i + 1) + j) / 2.0;
            for (int k = i; k < j; k++) {
                ranks[pairs[k].index] = avgRank;
            }
            i = j;
        }
        return ranks;
    }
}
