package com.github.mfriedenhagen.spockreports147

import spock.lang.Specification
import spock.lang.Unroll

class AppTest extends Specification {

    def 'Check source code in non data driven'() {
        given: "Nothing to see here"
        when:
        def myresult = true
        then:
        myresult == true
    }

    def 'Check non unrolled'(boolean result) {
        given: "Nothing to see here"
        when:
        def myresult = result
        then:
        myresult == true
        where:
        result << [true, false]
    }

    @Unroll("Check unrolled #result")
    def 'Check unrolled'(boolean result) {
        given: "Nothing to see here"
        when:
        def myresult = result
        then:
        myresult == true
        where:
        result << [true, false]
    }
}
