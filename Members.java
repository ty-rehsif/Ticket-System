package GaragePackage;

import java.lang.Math;
class Members {
//declaring instance variables
    double hrsPrk, hrRate, totalCharge, cHours;

    /**
     * @param parkedHrs
     * @param rate
     */
//initializing instance variables via a constructor using passed parameters
    Members(double parkedHrs, double rate){
        hrRate = rate;
        hrsPrk = parkedHrs;
    }

//method setting calculating rate and total charged hours for non members
    void setNonMemCharges(){
        this.hrRate = ((hrsPrk >15.0)?1.5:hrRate);
        this.cHours = Math.ceil(hrsPrk);
        this.totalCharge = cHours* hrRate;
        this.totalCharge = (Math.min(totalCharge, 120.0));
    }

//method setting calculating rate and total charged hours for members
    void setMemCharges(){
        this.cHours = Math.ceil(hrsPrk);
        this.totalCharge = cHours * hrRate;
        this.totalCharge = (Math.min(totalCharge, 120.0));
    }

    /**
     * @return
     */
//method returning hourly rate
    double getHrRate(){
        return hrRate;
    }

    /**
     * @return
     */
//method returning total charge
    double getTotalCharge (){
        return totalCharge;
    }

    /**
     * @return
     */
//method returning hours
    double getCharHours(){
        return cHours;
    }
}
