package emp2;

import java.util.List;

public class EmpService {
    // EmpDAO 호출
    private EmpDAO empDAO;

    public EmpService(EmpDAO empDAO) {
        this.empDAO = empDAO;
    }

    public boolean addEmp(EmpDTO dto) {
        return empDAO.insert(dto);
    }

    // getEmp() 호출하는 메소드
    // getRow()
    public EmpDTO getRow(int empno) {
        return empDAO.getEmp(empno);
    }

    // getList()
    public List<EmpDTO> getRows() {
        return empDAO.getList();
    }

    public boolean updateEmpInfo(EmpDTO dto) {
        return empDAO.empUpdate(dto);
    }

    public boolean deleteEmpInfo(int empno) {
        // return empDAO.'get'delete(empno); ~~~~~ ? ('get'(x)->'emp'(o))
        return empDAO.empDelete(empno); // ~~~~~~~ ? (o)
        // EmpDAO.java 클래스에서
        // =====> [특정 사원 정보 삭제] public boolean 'emp'Delete(int empno) {

    }
}
