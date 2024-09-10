package emp2;

import java.sql.DriverManager;
import java.util.List;
import java.util.Scanner;

public class EmpConsoleUtil {

    public EmpDTO insertEmp(Scanner sc) {
        // 입력 데이터 동적 처리
        System.out.println("=========== 데이터 입력 ===========");
        System.out.print("사번 : ");
        int empno = Integer.parseInt(sc.nextLine());
        System.out.print("이름 : ");
        String ename = sc.nextLine();
        System.out.print("직무 : ");
        String job = sc.nextLine();
        System.out.print("매니저 번호 : ");
        int mgr = Integer.parseInt(sc.nextLine());
        System.out.print("입사일 : ");
        String hiredate = sc.nextLine();
        System.out.print("급여 : ");
        int sal = Integer.parseInt(sc.nextLine());
        System.out.print("수당 : ");
        int comm = Integer.parseInt(sc.nextLine());
        System.out.print("부서번호 : ");
        int deptno = Integer.parseInt(sc.nextLine());

        return new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
    }

    public int getEmpNo(Scanner sc) {
        // 사번 입력받은 후 리턴
        System.out.print("조회할 사번 입력 >> ");
        // int empno = sc.nextInt();
        // return empno;
        return Integer.parseInt(sc.nextLine());
    }

    public void printEmp(EmpDTO dto) {
        // dto 내용 출력
        // smith 사원
        System.out.println(dto.getEname() + " 사원");
        System.out.println("==============================");
        System.out.println("사번 : " + dto.getEmpno()); // 사번 : 7788
        System.out.println("직무 : " + dto.getJob()); // 직무 :
        System.out.println("입사일 : " + dto.getHireDate()); // 입사일 :
        System.out.println("급여 : " + dto.getSal()); // 급여 :
        System.out.println("수당 : " + dto.getComm()); // 수당 :
        System.out.println("부서번호 : " + dto.getDeptno()); // 부서번호 :
        System.out.println();
    }

    public void printListEmp(List<EmpDTO> list) { // ---------> List.. 등 <자동완성> 으로 눌러주기!
        // list 에 들어있는 emp 출력

        System.out.println("============================================================================");
        System.out.println("empno   ename   job   mgr   hiredate    sal    comm    deptno");
        System.out.println("============================================================================");

        for (EmpDTO empDTO : list) {
            System.out.print(empDTO.getEmpno() + "\t");
            System.out.print(empDTO.getEname() + "\t");
            System.out.print(empDTO.getJob() + "\t");
            System.out.print(empDTO.getMgr() + "\t");
            System.out.print(empDTO.getHireDate() + "\t");
            System.out.print(empDTO.getSal() + "\t");
            System.out.print(empDTO.getComm() + "\t");
            System.out.print(empDTO.getDeptno() + "\n");
        }
    }

    public EmpDTO updateInfo(Scanner sc) { /// -----> 안 되는 이유가 (Scanner sc) 안 넣어서...
        // 수정할 정보 입력받기 => 입력받은 EmpDTO 담은 후 리턴
        System.out.println("============ 사원정보 수정 ============");
        System.out.print("사번 : ");
        int empno = Integer.parseInt(sc.nextLine());
        System.out.print("수당 : ");
        int comm = Integer.parseInt(sc.nextLine());
        System.out.print("급여 : ");
        int sal = Integer.parseInt(sc.nextLine()); // --------------- ???

        EmpDTO dto = new EmpDTO();
        dto.setEmpno(empno);
        dto.setSal(sal);
        dto.setComm(comm);
        return dto;
        // return new EmpDTO(empno, null, null, 0, null, sal, comm, 0);
    }

    public int deleteEmpNo(Scanner sc) {
        // 삭제할 empno 받은 후 리턴
        System.out.print("삭제할 사번 입력 >> ");
        return Integer.parseInt(sc.nextLine());
    }
}
