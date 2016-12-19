set search_path to nmc;

INSERT INTO userroleactionrights(testcaseid,reopen_bill,direct_billing,add_items_to_bill,create_bill_for_closed_visit,cancel_bill,cancel_items_in_bill,allow_refunds,allow_discounts,allow_all_rate_increase,allow_all_rate_decrease,view_all_rates_in_order,view_general_rates_in_order,allow_back_date,allow_receipt_back_date,allocate_shift_bed,allow_set_charges_bed_type,edit_inactive_visit_discharge_summary,edit_reg_first_name,edit_reg_custom_fields,patient_category_change,signoff_labser_reports,allow_new_reg,cancel_test,allow_retail_credit_sales,allow_max_cost_price_change,show_avble_qty_on_raiseindent,reopen_codification,allow_direct_stock_entry,user_counter_day_book,edit_receipt_amount,cancel_app,new_bill_for_order,validate_test_result,revert_signoff,amend_test_result,amend_score_card_values,reopen_cons_after_time_limit,return_ph_item_after_validity,package_approval,pbm_prescription_finalize,erx_consultation_access,erx_dis_medication,allow_prior_auth_presc_edit,reg_charge_appl,patient_header_edit,allow_back_date_app,del_pat_gen_doc,allow_denial_accept,val_discharge_summary_report,del_discharge_summary_report,reopen_discharge_summary_report,signoff_blood_trans,allow_view_off_clinical_alerts,birth_reg)
VALUES('4','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A');

INSERT INTO logindata (testcaseid,hospital,username,password,altpassword)
VALUES ('4','nmc','InstaAdmin','InstaAdmin','Insta@123');

select * from userrolescreenrights;

INSERT INTO userrolescreenrights (testcaseid,RoleName,PatientSearch,Registration,Billing,DischargeSummary,CancerActivities,Payments,Services,OTServices,OTManagement,Laboratory,Radiology,Scheduler,InPatient,Dialysis,ClinicalData,DoctorConsultation,OutPatient,MedicalRecords,SalesIssues,Procurement,StoreMgmt,Insurance,ERxAuthorization,MaintContracts,PatientStatsReports,PatientFeedbackReports,RosterReports,CSSD,AdvancedPackages,MaintContractsReports,FinancialReports,BillingReports,SalesIssuesReports,ProcurementReports,StoreMgmtReports,DiagnosticsReports,PatientPackageReports,DialysisReports,ClinicalDataReports,ServiceReports,ConsultationReports,SchedulerReports,OTReports,BedUtilReports,DentalReports,WardActivitiesReports,InsuranceReports,DietaryReports,MRDReports,MasterReports,CustomReports,FavouriteReports,Preferences,BillingPreferences,PrintTemplates,DocumentTemplates,GeneralMasters,HospitalAdminMasters,HospitalBillingMasters,DentalMasters,Roster,StoresMasters,MessagingMasters,Administration,Dietary,PatientFeedback,Common)
VALUES ('4','Store Role','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y'
);

select * from logindata;

INSERT INTO logindata (testcaseid,hospital,username,password,altpassword)
VALUES ('1','nmc','InstaAdmin','InstaAdmin','Insta@123');

INSERT INTO testcase (Module,ActionClass,Author,Description)
VALUES ('Security','UserLoginAction','Vinay','Verify InstaAdmin user login');

select * from testcase;
