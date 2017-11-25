package net.dankito.readability4j.additional

import net.dankito.readability4j.model.Readability4JTestBase
import org.junit.Test


open class AdditionalReadability4JTests : Readability4JTestBase() {


    @Test
    fun testBento1() {
        testPage("http://www.bento.de/haha/jamaika-aus-hier-sind-exklusiv-die-satirischen-fdp-wahlplakate-fuer-die-neuwahlen-1876078/", "bento-1")
    }

    @Test
    fun testFaz1() {
        testPage("http://www.faz.net/aktuell/wirtschaft/unternehmen/bmw-steckt-viel-geld-in-erforschung-der-batteriezelle-15308519.html", "faz-1")
    }

    @Test
    fun testSueddeutscheParadisePapers() {
        testPage("https://projekte.sueddeutsche.de/paradisepapers/wirtschaft/carstensen-und-der-pharma-milliardaer-e624335", "sueddeutsche-paradise-papers")
    }


    protected open fun testPage(url: String, pageName: String) {
        testPage(url, "additional-test-pages", pageName)
    }


}