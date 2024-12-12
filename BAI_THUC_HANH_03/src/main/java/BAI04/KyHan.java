/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package BAI04;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author trung
 */
public enum KyHan {
        MOT_TUAN {
            @Override
            public Calendar tinhDaoHan(Calendar current) {
                current.add(Calendar.DAY_OF_YEAR, 7);
                return current;
            }

            @Override
            public BigDecimal tinhLai(BigDecimal tien) {
                //                365/366 --> 0.0005
//                7 -->
                Calendar d = new GregorianCalendar();
                int num = d.getMaximum(Calendar.DAY_OF_YEAR);
                return tien.multiply(new BigDecimal(7*0.0005)).divide(new BigDecimal(num), RoundingMode.HALF_UP);
            }
        },
        MOT_THANG {
            @Override
            public Calendar tinhDaoHan(Calendar current) {
                current.add(Calendar.MONTH,1);
                return current;
            }

            @Override
            public BigDecimal tinhLai(BigDecimal tien) {
//                12 --> 0.045
//                1 -->
                return tien.multiply(new BigDecimal(0.045)).divide(new BigDecimal(12),RoundingMode.HALF_UP);
            }
        },
        MOT_NAM {
            @Override
            public Calendar tinhDaoHan(Calendar current) {
                current.add(Calendar.YEAR,1);
                return current;
            }

            @Override
            public BigDecimal tinhLai(BigDecimal tien) {
                return tien.multiply(new BigDecimal(0.068));
            }
        };
        
        public abstract Calendar tinhDaoHan(Calendar current);
        
        public abstract BigDecimal tinhLai(BigDecimal tien);
}
