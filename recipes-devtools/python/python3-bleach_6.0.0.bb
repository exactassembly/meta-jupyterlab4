SUMMARY = "An easy safelist-based HTML-sanitizing tool."
HOMEPAGE = "https://github.com/mozilla/bleach"
AUTHOR = " <>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=adea50d072dac455e5a50a518e2d01aa"

SRC_URI[md5sum] = "3fdbd06a0ab2f2f9c4e574815645dd1c"
SRC_URI[sha256sum] = "1a1a85c1595e07d8db14c5f09f09e6433502c51c595970edc090551f0db99414"

PYPI_PACKAGE = "bleach"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
    bash \
    ${PYTHON_PN}-six \
    ${PYTHON_PN}-webencodings \
"

BBCLASSEXTEND = "native nativesdk"
