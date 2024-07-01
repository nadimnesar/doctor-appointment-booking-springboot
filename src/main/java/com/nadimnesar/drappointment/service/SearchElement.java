package com.nadimnesar.drappointment.service;

import java.util.ArrayList;
import java.util.Collections;

public class SearchElement {
    private ArrayList<String> divisionList = new ArrayList<>();
    private ArrayList<String> districtList = new ArrayList<>();
    private ArrayList<String> specialtyList = new ArrayList<>();

    private SearchElement() {

    }

    private static SearchElement instance = null;

    public static SearchElement getInstance() {
        if (instance == null) {
            instance = new SearchElement();
            instance.fetchDivisions();
            instance.fetchDistricts();
            instance.fetchSpecialties();
            return instance;
        }
        return instance;
    }

    public ArrayList<String> getDivisionList() {
        return divisionList;
    }

    public ArrayList<String> getDistrictList() {
        return districtList;
    }

    public ArrayList<String> getSpecialtyList() {
        return specialtyList;
    }

    private void fetchDivisions() {
        divisionList.add("Dhaka");
        divisionList.add("Chittagong");
        divisionList.add("Rajshahi");
        divisionList.add("Sylhet");
        divisionList.add("Rangpur");
        divisionList.add("Barisal");
        divisionList.add("Khulna");
        divisionList.add("Mymensingh");
        Collections.sort(divisionList);
    }

    private void fetchDistricts() {
        districtList.add("Dhaka");
        districtList.add("Sylhet");
        districtList.add("Narayanganj");
        districtList.add("Moulvibazar");
        districtList.add("Narsingdi");
        districtList.add("Gopalganj");
        districtList.add("Sunamganj");
        districtList.add("Gazipur");
        districtList.add("Habiganj");
        districtList.add("Khulna");
        districtList.add("Bagerhat");
        districtList.add("Satkhira");
        districtList.add("Jessore");
        districtList.add("Narail");
        districtList.add("Magura");
        districtList.add("Jhenaidah");
        districtList.add("Chuadanga");
        districtList.add("Meherpur");
        districtList.add("Kushtia");
        districtList.add("Comilla");
        districtList.add("Panchagarh");
        districtList.add("Bandarban");
        districtList.add("Chittagong");
        districtList.add("Rangamati");
        districtList.add("Khagrachhari");
        districtList.add("Noakhali");
        districtList.add("Feni");
        districtList.add("Lakshmipur");
        districtList.add("Coxs Bazar");
        districtList.add("Chandpur");
        districtList.add("Brahmanbaria");
        districtList.add("Barguna");
        districtList.add("Patuakhali");
        districtList.add("Jhalokati");
        districtList.add("Bhola");
        districtList.add("Pirojpur");
        districtList.add("Barisal");
        districtList.add("Natore");
        districtList.add("Nilphamari");
        districtList.add("Thakurgaon");
        districtList.add("Lalmonirhat");
        districtList.add("Kurigram");
        districtList.add("Rangpur");
        districtList.add("Dinajpur");
        districtList.add("Gaibandha");
        districtList.add("Joypurhat");
        districtList.add("Naogaon");
        districtList.add("Bogra");
        districtList.add("Chapainawabganj");
        districtList.add("Rajshahi");
        districtList.add("Sirajganj");
        districtList.add("Madaripur");
        districtList.add("Pabna");
        districtList.add("Sherpur");
        districtList.add("Jamalpur");
        districtList.add("Netrokona");
        districtList.add("Mymensingh");
        districtList.add("Tangail");
        districtList.add("Kishoreganj");
        districtList.add("Manikganj");
        districtList.add("Rajbari");
        districtList.add("Faridpur");
        districtList.add("Munshiganj");
        districtList.add("Shariatpur");
        Collections.sort(districtList);
    }

    private void fetchSpecialties() {
        specialtyList.add("Gastro Liver");
        specialtyList.add("Child Specialist");
        specialtyList.add("Cardiac Surgery");
        specialtyList.add("Thoracic Surgery");
        specialtyList.add("Chest & Esophageal Surgeon");
        specialtyList.add("Rheumatism specialist");
        specialtyList.add("Chest(Lung) & Esophageal Specialist");
        specialtyList.add("Mother & Child Disease");
        specialtyList.add("Pedodontics");
        specialtyList.add("Prosthodontics");
        specialtyList.add("Orthodontics");
        specialtyList.add("Oral Maxilofacial Surgery");
        specialtyList.add("Conservative Dentistry");
        specialtyList.add("Hepatology");
        specialtyList.add("Family Medicine");
        specialtyList.add("Drug Sddiction");
        specialtyList.add("Psychiatrist");
        specialtyList.add("Physiatrist");
        specialtyList.add("Skin Specialist");
        specialtyList.add("Paralysis");
        specialtyList.add("Arthritis");
        specialtyList.add("Venereology");
        specialtyList.add("Diabetes");
        specialtyList.add("Sonologist");
        specialtyList.add("Radiotherapist");
        specialtyList.add("Oral & Dental Surgery");
        specialtyList.add("Endoscopist");
        specialtyList.add("Orthopedic Surgery");
        specialtyList.add("Laparoscopic Surgery");
        specialtyList.add("Nutritionist");
        specialtyList.add("Paediatrics");
        specialtyList.add("Rehabilitation Medicine");
        specialtyList.add("Orthopedician");
        specialtyList.add("Nephrology");
        specialtyList.add("Oncology");
        specialtyList.add("Pediatric Endocrinology");
        specialtyList.add("Cytopathology");
        specialtyList.add("Hepatopancreatobiliary Surgery");
        specialtyList.add("Neuro Medicine");
        specialtyList.add("Neuro Surgeon");
        Collections.sort(specialtyList);
    }
}