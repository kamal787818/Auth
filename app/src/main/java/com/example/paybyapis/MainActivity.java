package com.example.paybyapis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.apis.Apisf;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Apisf.makePostRequest("{\"username\":\"KAM787818790\",\"mobile\":\"7878188407\",\"name\":\"EG Payment\",\"email\":\"testtt@tes.com\",\"earnings\":0.9499999999999999555910790149937383830547332763671875,\"date\":\"2023-06-26\",\"user_type\":\"User\",\"news\":\"All services are working fine! For any kind of issue please Call or WhatsApp us on our support number 7878637335\",\"paytm_getway\":\"Yes\",\"whatsapp_number\":\"7878637335\",\"support_number\":\"7878637335\",\"support_email\":\"support@egpayment.com\",\"support_message\":\"Monday to Sunday (6AM to 11PM)\",\"address\":\"JPRWebs,C26D 3rd Floor, RIICCO Industrial Area, Malviya nagar, Jaipur, Rajasthan - 302017\",\"company_name\":\"EG Payment\",\"version_code\":\"35\",\"update_version_name\":\"4.2.4\",\"update_version_code\":\"34\",\"update_message\":\"<p>Version 2.3<\\/p>\\n                                    <p>- Performance Improvement<\\/p>\\n                                    <p>- New services added (Gas Cylinder Payment, Insurance Payment, Broadband Payments, OTT subscriptions, FASTag Recharge.<\\/p>\\n                                    <p>- Bug Fixes & Improvement<\\/p>\",\"slides\":[{\"slide\":\"84927c6738e05034748a4199b0f2e290.png\",\"url\":\"https:\\/\\/egpayment.com\\/home\\/deals\\/7878188407\",\"in_app\":\"3\"},{\"slide\":\"7daf2cf77d0611383872713c379df3c3.png\",\"url\":\"\",\"in_app\":\"1\"},{\"slide\":\"a35854fdfd466231430944da73dfbfef.png\",\"url\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.paybyapis\",\"in_app\":\"1\"}],\"slide_path\":\"https:\\/\\/paybyapis.com\\/images\\/app_slides\",\"refer_and_earn_banner\":\"7daf2cf77d0611383872713c379df3c3.png\",\"shareText\":\"Join with my referral link and get Rs.5 & also earn Rs.250 on 10 referrals. On EG Payment you can get cash back upto 4.5% on every recharge.  \",\"referCode\":\"KAM787818790\",\"warning_message\":\"Read carefully! Successful recharge will not be refunded. Plans are subject to change, always verify with operator.\",\"is_mpin_set\":true,\"dynamic_menus\":{\"img_path\":\"https:\\/\\/paybyapis.com\\/images\\/icons\",\"show_status\":true,\"menus\":[{\"title\":\"Insurance & Other Services\",\"sub_menus\":[{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"Google Play\",\"icon\":\"playstore.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.OttActivity\",\"offer_type\":\"circle\",\"offer_txt\":\"1%\",\"put_extra\":\"title__Google Play Redeem Codes___operatorId__245\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"Amazon Voucher\",\"icon\":\"amazon.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.OttActivity\",\"offer_type\":\"circle\",\"offer_txt\":\"1%\",\"put_extra\":\"title__Amazon Shopping Vouchers___operatorId__373\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"Swiggy Voucher\",\"icon\":\"swiggy.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.OttActivity\",\"offer_type\":\"circle\",\"offer_txt\":\"3%\",\"put_extra\":\"title__Swiggy Money Vouchers___operatorId__374\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"Purchase Gift Cards\",\"icon\":\"gift_cards-min.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.SelectBoardActivity\",\"offer_type\":\"top\",\"offer_txt\":\"UPTO 11%\",\"put_extra\":\"title__Purchase Gift Cards___type__GiftCards\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"Bike\",\"icon\":\"bike.png\",\"in_app\":3,\"url\":\"https:\\/\\/egpayment.com\\/home\\/deals\\/7878188407?type=Bike\",\"offer_type\":\"top\",\"offer_txt\":\"Earn Rs.250\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"00AA00\",\"ref_color\":\"#000000\",\"name\":\"Car\",\"icon\":\"car.png\",\"in_app\":3,\"url\":\"https:\\/\\/egpayment.com\\/home\\/deals\\/7878188407?type=Car\",\"offer_type\":\"top\",\"offer_txt\":\"20% Cashback\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"DMT\",\"icon\":\"bank-transfer.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.Bankingmain\",\"offer_type\":\"top\",\"offer_txt\":\" New \",\"put_extra\":\"\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#FFFFFF\",\"name\":\"KYC\",\"icon\":\"profile.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.kyc.KycActivity\",\"offer_type\":\"top\",\"offer_txt\":\" Pending \",\"put_extra\":\"\"}]}],\"bbps_menus\":[{\"title\":\"BBPS SERVICES\",\"sub_menus\":[{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"Postpaid\",\"icon\":\"mobile-min.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.RechargeActivity\",\"offer_type\":\"\",\"offer_txt\":\"1%\",\"put_extra\":\"title__Postpaid Recharge\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"Electricity\",\"icon\":\"electricity-min.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.ElectricityBillActivity\",\"offer_type\":\"\",\"offer_txt\":\"1%\",\"put_extra\":\"title__Electricity Bill Payments\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"BroadBand\",\"icon\":\"broadband_new.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.BillActivity\",\"offer_type\":\"\",\"offer_txt\":\"1%\",\"put_extra\":\"title__Landline\\/BroadBand Bill Payments\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"Piped Gas\",\"icon\":\"pipe_gas-min.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.BillActivity\",\"offer_type\":\"\",\"offer_txt\":\"1%\",\"put_extra\":\"title__Piped Gas Bill Payments\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"Water Bill Payments\",\"icon\":\"water-min.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.BillActivity\",\"offer_type\":\"\",\"offer_txt\":\"1%\",\"put_extra\":\"title__Water Bill Payments\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"FASTag Payments\",\"icon\":\"fastag-min.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.BillActivity\",\"offer_type\":\"\",\"offer_txt\":\"1%\",\"put_extra\":\"title__FASTag Payments\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"Cylinder Booking\",\"icon\":\"gas-min.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.BillActivity\",\"offer_type\":\"\",\"offer_txt\":\"1%\",\"put_extra\":\"title__Cylinder Booking___type__Cylinder\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"Insurance Premimum\",\"icon\":\"insurance-min.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.BillActivity\",\"offer_type\":\"\",\"offer_txt\":\"1%\",\"put_extra\":\"title__Insurance Premimum\"},{\"text_color\":\"#FFFFFF\",\"bg_color\":\"FF6150\",\"ref_color\":\"#0000FF\",\"name\":\"Purchase Gift Cards\",\"icon\":\"gift_cards-min.png\",\"in_app\":2,\"url\":\"com.paybyapis.modules.activities.SelectBoardActivity\",\"offer_type\":\"\",\"offer_txt\":\"1%\",\"put_extra\":\"title__Purchase Gift Cards___type__GiftCards\"}]}]},\"dataexpiry\":432000}\n","121212","token",MainActivity.this);
    }
}