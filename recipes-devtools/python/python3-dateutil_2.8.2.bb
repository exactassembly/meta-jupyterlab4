SUMMARY = "Extensions to the standard Python datetime module"
HOMEPAGE = "https://github.com/dateutil/dateutil"
AUTHOR = "Gustavo Niemeyer <gustavo@niemeyer.net>"
LICENSE = "Apache-2.0 & BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://LICENSE;md5=e3155c7bdc71f66e02678411d2abf996 \
"

SRC_URI[sha256sum] = "0123cacc1627ae19ddf3c27a5de5bd67ee4586fbdd6440d9748f8abb483d3e86"

PYPI_PACKAGE = "python-dateutil"

DEPENDS = "\
    ${PYTHON_PN}-setuptools-scm-native \
"

inherit pypi python_setuptools_build_meta

RDEPENDS_${PN} = "\
    ${PYTHON_PN}-six \
"

BBCLASSEXTEND = "native nativesdk"