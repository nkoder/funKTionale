/*
 * Copyright 2013 - 2016 Mario Arias
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.funktionale.reverse

fun <P1, P2, R> Function2<P1, P2, R>.reverse(): (P2, P1) -> R {
    return { p2: P2, p1: P1 -> this(p1, p2) }
}


fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.reverse(): (P3, P2, P1) -> R {
    return { p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3) }
}


fun <P1, P2, P3, P4, R> Function4<P1, P2, P3, P4, R>.reverse(): (P4, P3, P2, P1) -> R {
    return { p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4) }
}


fun <P1, P2, P3, P4, P5, R> Function5<P1, P2, P3, P4, P5, R>.reverse(): (P5, P4, P3, P2, P1) -> R {
    return { p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5) }
}


fun <P1, P2, P3, P4, P5, P6, R> Function6<P1, P2, P3, P4, P5, P6, R>.reverse(): (P6, P5, P4, P3, P2, P1) -> R {
    return { p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6) }
}


fun <P1, P2, P3, P4, P5, P6, P7, R> Function7<P1, P2, P3, P4, P5, P6, P7, R>.reverse(): (P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, R> Function8<P1, P2, P3, P4, P5, P6, P7, P8, R>.reverse(): (P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> Function9<P1, P2, P3, P4, P5, P6, P7, P8, P9, R>.reverse(): (P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> Function10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>.reverse(): (P10, P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p10: P10, p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> Function11<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>.reverse(): (P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p11: P11, p10: P10, p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> Function12<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>.reverse(): (P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p12: P12, p11: P11, p10: P10, p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> Function13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>.reverse(): (P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p13: P13, p12: P12, p11: P11, p10: P10, p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> Function14<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>.reverse(): (P14, P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p14: P14, p13: P13, p12: P12, p11: P11, p10: P10, p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> Function15<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>.reverse(): (P15, P14, P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p15: P15, p14: P14, p13: P13, p12: P12, p11: P11, p10: P10, p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> Function16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>.reverse(): (P16, P15, P14, P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p16: P16, p15: P15, p14: P14, p13: P13, p12: P12, p11: P11, p10: P10, p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> Function17<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>.reverse(): (P17, P16, P15, P14, P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p17: P17, p16: P16, p15: P15, p14: P14, p13: P13, p12: P12, p11: P11, p10: P10, p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> Function18<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>.reverse(): (P18, P17, P16, P15, P14, P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p18: P18, p17: P17, p16: P16, p15: P15, p14: P14, p13: P13, p12: P12, p11: P11, p10: P10, p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> Function19<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>.reverse(): (P19, P18, P17, P16, P15, P14, P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p19: P19, p18: P18, p17: P17, p16: P16, p15: P15, p14: P14, p13: P13, p12: P12, p11: P11, p10: P10, p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> Function20<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>.reverse(): (P20, P19, P18, P17, P16, P15, P14, P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p20: P20, p19: P19, p18: P18, p17: P17, p16: P16, p15: P15, p14: P14, p13: P13, p12: P12, p11: P11, p10: P10, p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> Function21<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>.reverse(): (P21, P20, P19, P18, P17, P16, P15, P14, P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p21: P21, p20: P20, p19: P19, p18: P18, p17: P17, p16: P16, p15: P15, p14: P14, p13: P13, p12: P12, p11: P11, p10: P10, p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }
}


fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> Function22<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>.reverse(): (P22, P21, P20, P19, P18, P17, P16, P15, P14, P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1) -> R {
    return { p22: P22, p21: P21, p20: P20, p19: P19, p18: P18, p17: P17, p16: P16, p15: P15, p14: P14, p13: P13, p12: P12, p11: P11, p10: P10, p9: P9, p8: P8, p7: P7, p6: P6, p5: P5, p4: P4, p3: P3, p2: P2, p1: P1 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }
}
