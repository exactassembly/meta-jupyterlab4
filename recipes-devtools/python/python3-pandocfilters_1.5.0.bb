
SUMMARY = "Utilities for writing pandoc filters in python"
HOMEPAGE = "http://github.com/jgm/pandocfilters"
AUTHOR = "John MacFarlane <fiddlosopher@gmail.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=28b59ac864caa776edcbdb77a8a57267"

SRC_URI[sha256sum] = "0b679503337d233b4339a817bfc8c50064e2eff681314376a47cb582305a7a38"

PYPI_PACKAGE = "pandocfilters"

DEPENDS += "\
"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = " \
"