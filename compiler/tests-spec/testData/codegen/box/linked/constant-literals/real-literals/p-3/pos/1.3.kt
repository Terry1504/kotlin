/*
 * KOTLIN CODEGEN BOX SPEC TEST (POSITIVE)
 *
 * SECTIONS: constant-literals, real-literals
 * PARAGRAPH: 3
 * SENTENCE: [1] The whole-number part and the exponent part may be omitted.
 * NUMBER: 3
 * DESCRIPTION: Real literals with omitted a whole-number part and an exponent mark.
 */

val value_1 = .0e0
val value_2 = .0e-00
val value_3 = .0E000
val value_4 = .0E+0000
val value_5 = .0e+0
val value_6 = .00e00
val value_7 = .000E-000

val value_8 = .0E+1
val value_9 = .00e22
val value_10 = .345678e00000000001
val value_11 = .56e-0
val value_12 = .65e000000000000
val value_13 = .7654E+010
val value_14 = .876543E1
val value_15 = .98765432e-2
val value_16 = .0987654321E-3

val value_17 = .1111e4
val value_18 = .22222E-5
val value_19 = .33333e+6
val value_20 = .444444E7
val value_21 = .5555555e8
val value_22 = .777777777E-308
val value_23 = .99999999999e-309

val value_24 = .000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
val value_25 = .000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e-000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
val value_26 = .000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e+000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000

fun box(): String? {
    if (value_1.compareTo(.0e0) != 0 || value_1.compareTo(0.0) != 0) return null
    if (value_2.compareTo(.0e-00) != 0 || value_2.compareTo(0.0) != 0) return null
    if (value_3.compareTo(.0E000) != 0 || value_3.compareTo(0.0) != 0) return null
    if (value_4.compareTo(.0E+0000) != 0 || value_4.compareTo(0.0) != 0) return null
    if (value_5.compareTo(.0e+0) != 0 || value_5.compareTo(0.0) != 0) return null
    if (value_6.compareTo(.00e00) != 0 || value_6.compareTo(0.0) != 0) return null
    if (value_7.compareTo(.000E-000) != 0 || value_7.compareTo(0.0) != 0) return null

    if (value_8.compareTo(.0E+1) != 0 || value_8.compareTo(0.0) != 0) return null
    if (value_9.compareTo(.00e22) != 0 || value_9.compareTo(0.0) != 0) return null
    if (value_10.compareTo(.345678e00000000001) != 0 || value_10.compareTo(3.45678) != 0) return null
    if (value_11.compareTo(.56e-0) != 0 || value_11.compareTo(0.56) != 0) return null
    if (value_12.compareTo(.65e000000000000) != 0 || value_12.compareTo(0.65) != 0) return null
    if (value_13.compareTo(.7654E+010) != 0 || value_13.compareTo(7.654E9) != 0) return null
    if (value_14.compareTo(.876543E1) != 0 || value_14.compareTo(8.76543) != 0) return null
    if (value_15.compareTo(.98765432e-2) != 0 || value_15.compareTo(0.0098765432) != 0) return null
    if (value_16.compareTo(.0987654321E-3) != 0 || value_16.compareTo(9.87654321E-5) != 0) return null

    if (value_17.compareTo(.1111e4) != 0 || value_17.compareTo(1111.0) != 0) return null
    if (value_18.compareTo(.22222E-5) != 0 || value_18.compareTo(2.2222E-6) != 0) return null
    if (value_19.compareTo(.33333e+6) != 0 || value_19.compareTo(333330.0) != 0) return null
    if (value_20.compareTo(.444444E7) != 0 || value_20.compareTo(4444440.0) != 0) return null
    if (value_21.compareTo(.5555555e8) != 0 || value_21.compareTo(5.555555E7) != 0) return null
    if (value_22.compareTo(.777777777E-308) != 0 || value_22.compareTo(7.77777777E-309) != 0) return null
    if (value_23.compareTo(.99999999999e-309) != 0 || value_23.compareTo(9.9999999999E-310) != 0) return null
    if (value_24.compareTo(.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000) != 0 || value_24.compareTo(0.0) != 0) return null
    if (value_25.compareTo(.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e-000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000) != 0 || value_25.compareTo(0.0) != 0) return null
    if (value_26.compareTo(.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e+000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000) != 0 || value_26.compareTo(0.0) != 0) return null

    return "OK"
}
