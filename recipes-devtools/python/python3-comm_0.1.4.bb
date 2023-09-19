SUMMARY = "Jupyter Python Comm implementation, for usage in ipykernel, xeus-python etc."
HOMEPAGE = ""
AUTHOR = "Jupyter contributors <>"
LICENSE = "BSD-3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3a623b76c23287751590a7793a86e552"

SRC_URI[md5sum] = "df678320a3be3097c28272bfde183820"
SRC_URI[sha256sum] = "354e40a59c9dd6db50c5cc6b4acc887d82e9603787f83b68c01a80a923984d15"

inherit pypi python_hatchling

RDEPENDS_${PN} = "\
    ${PYTHON_PN}-traitlets \
"

BBCLASSEXTEND = "native nativesdk"
