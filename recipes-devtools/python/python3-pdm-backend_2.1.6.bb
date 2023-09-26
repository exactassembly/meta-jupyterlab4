
SUMMARY = "The build backend used by PDM that supports latest packaging standards"
HOMEPAGE = "https://pdm.fming.dev/"
AUTHOR = "Frost Ming <mianghong@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2eb31a2cc1a758c34b499f287dd04ef2"

SRC_URI[sha256sum] = "75cdee279ce99df3ce9c53c5c81e3cc1cd3f9fa901eeb14d2bc88ab770daf92d"

PYPI_PACKAGE = "pdm_backend"

DEPENDS += "\
"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += "\
"

BBCLASSEXTEND = "native nativesdk"