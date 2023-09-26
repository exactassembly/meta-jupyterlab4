
SUMMARY = "A modern Python package and dependency manager supporting the latest PEP standards"
HOMEPAGE = "https://pdm.fming.dev/"
AUTHOR = "Frost Ming <mianghong@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2eb31a2cc1a758c34b499f287dd04ef2"

SRC_URI[sha256sum] = "53d37a84a0bd3d5dc9db3e3de19ab120d2dda82ebfcc1e4508ea7be34221181e"

PYPI_PACKAGE = "pdm"

DEPENDS += "\
    python3-pdm-backend-native \
"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += "\
"

BBCLASSEXTEND = "native nativesdk"