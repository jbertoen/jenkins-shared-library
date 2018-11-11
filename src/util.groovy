#!/usr/bin/groovy
import shared.util

class Utilities {
    def sharedUsage() {
        util = new util()
        util.utilOutput("Shared method")
    }
}

this
