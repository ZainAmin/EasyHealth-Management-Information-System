package it.unicas.prescription.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.prescription.dao.PrescriptionManagementDAO;
import it.unicas.prescription.pojo.Prescription;

public class SavePrescriptionAction extends ActionSupport {

    private String patientId;
    private String appointmentId;
    private String doctorId;
    private String dm;
    private String htn;
    private String ihd;
    private String ckd;
    private String cabg;
    private String stenting;
    private String antiCoagulaut;
    private String bep;
    private String thyroid;
    private String paceMacker;
    private String medicineType;
    private String medicineName;
    private String medicineDose;
    private String medicineDuration;
    private String investigationType;
    private String treatmentPlan;
    private String doctorNote;

    public String execute() {
        String statusCode = "";
        System.out.println(doctorId);
        Prescription prescription = new Prescription(appointmentId,patientId,doctorId, dm,htn,ihd,ckd,cabg,stenting,antiCoagulaut,bep,thyroid,paceMacker,medicineType,medicineName,medicineDose,medicineDuration,investigationType,treatmentPlan,doctorNote);
        int recordAdded = PrescriptionManagementDAO.addData(prescription);

        if (recordAdded == 1) {
            statusCode = ActionSupport.SUCCESS;
        } else {
            statusCode = ActionSupport.ERROR;
        }
        return statusCode;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getHtn() {
        return htn;
    }

    public void setHtn(String htn) {
        this.htn = htn;
    }

    public String getIhd() {
        return ihd;
    }

    public void setIhd(String ihd) {
        this.ihd = ihd;
    }

    public String getCkd() {
        return ckd;
    }

    public void setCkd(String ckd) {
        this.ckd = ckd;
    }

    public String getCabg() {
        return cabg;
    }

    public void setCabg(String cabg) {
        this.cabg = cabg;
    }

    public String getStenting() {
        return stenting;
    }

    public void setStenting(String stenting) {
        this.stenting = stenting;
    }

    public String getAntiCoagulaut() {
        return antiCoagulaut;
    }

    public void setAntiCoagulaut(String antiCoagulaut) {
        this.antiCoagulaut = antiCoagulaut;
    }

    public String getBep() {
        return bep;
    }

    public void setBep(String bep) {
        this.bep = bep;
    }

    public String getThyroid() {
        return thyroid;
    }

    public void setThyroid(String thyroid) {
        this.thyroid = thyroid;
    }

    public String getPaceMacker() {
        return paceMacker;
    }

    public void setPaceMacker(String paceMacker) {
        this.paceMacker = paceMacker;
    }

    public String getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineDose() {
        return medicineDose;
    }

    public void setMedicineDose(String medicineDose) {
        this.medicineDose = medicineDose;
    }

    public String getMedicineDuration() {
        return medicineDuration;
    }

    public void setMedicineDuration(String medicineDuration) {
        this.medicineDuration = medicineDuration;
    }

    public String getInvestigationType() {
        return investigationType;
    }

    public void setInvestigationType(String investigationType) {
        this.investigationType = investigationType;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public String getDoctorNote() {
        return doctorNote;
    }

    public void setDoctorNote(String doctorNote) {
        this.doctorNote = doctorNote;
    }
}
