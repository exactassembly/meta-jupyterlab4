SUMMARY = "Internationalization utilities"
HOMEPAGE = "https://babel.pocoo.org/"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f97d9a63e91407b4c0d01efde91cfc0"

SRC_URI = "https://files.pythonhosted.org/packages/ba/42/54426ba5d7aeebde9f4aaba9884596eb2fe02b413ad77d62ef0b0422e205/Babel-2.12.1.tar.gz"
SRC_URI[sha256sum] = "cc2d99999cd01d44420ae725a21c9e3711b3aadc7976d6147f622d8581963455"

PYPI_PACKAGE = "Babel"

inherit pypi python_setuptools_build_meta

RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"